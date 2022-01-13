package com.groupeisi.m3gl;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.groupeisi.m3gl");

        noClasses()
            .that()
            .resideInAnyPackage("com.groupeisi.m3gl.service..")
            .or()
            .resideInAnyPackage("com.groupeisi.m3gl.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.groupeisi.m3gl.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import com.xero.kotlin.v2018_2.buildTypes.TeamcityKotlinValidationBuild
version = "2021.1"

project {
    params {
        // This makes it impossible to change the build settings through the UI
        param("teamcity.ui.settings.readOnly", "true")
        param("github.user", "<insert user used to access github>")
        password("github.token", "<insert users token used to access github>")
    }

    buildType(TeamcityKotlinValidationBuild({
        name = "Validate Build Configuration"
        id("ValidateBuildConfiguration".toId())
    }))
}

grails.servlet.version = "3.0"
grails.project.work.dir="target/work"

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    inherits "global" // inherit Grails default dependencies

    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }

    dependencies {

    }

    plugins {
        // plugins for the build system only
        build ":tomcat:7.0.50"
        // plugins needed at runtime but not for compilation
        runtime ":hibernate:3.6.10.7" // or ":hibernate4:4.1.11.2"
        compile ":spring-security-core:1.2.7.3"
        build ":release:3.0.1"
    }
}


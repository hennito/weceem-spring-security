# Weceem Spring Security Plugin for Grails

This is the code for a plugin that will bridge your application's Spring Security and domain classes
to the free Open Source [Weceem CMS](http://weceem.org) plugin for [Grails](http://grails.org).

Security in [the Weceem plugin](http://github.com/jCatalog/weceem-plugin) is completely decoupled so that you can plug in whatever security mechanism you are using, 
and this plugin uses this mechanism to have your user information supplied to Weceem from Spring Security Core.

You can configure the property mappings from your user domain classes to the user object properties available at runtime.

Full documentation is available on the [Weceem site](http://weceem.org)


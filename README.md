spring-config
=============

show case: modular spring config with properies overrides in root module


This example shows how to manage configurations files in a modular spring application.
Application have two functional modules: dao and web; and one root module where we override default configuration properties.
There is an possibility to override root configuration properties by file which you can put in ${user.home} directory.
Properties which were specified in VM options (e.g. -Djdbc.url=overridden_url) will override any properties. Thus VM options
have highest pripority.

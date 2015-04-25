---
layout: page
title: "Advanced user's guide: configuration and formatting options"
---


## Configuration files ##

The directories for markdown and java source files, and values to use in filtering text of your markdown source are read from a configuration file.  By default, the build system looks for a file named `conf.gradle`, but you can override this by setting the `conf` system property in gradle.  One way to define a system property is with the `-P` flag on the command line so if you wanted to run your tests using configuration data in a file called `myproject.gradle`, you could run

    gradle -Pconf=myproject.gradle conc

In this way, you could run concordion tests on multiple writing projects, each with its own configuration, by using distinct configuration files.

## Settings for directory location ##

Two properties, `mdSrc` and `javaSrc`, can give either relative or absolute paths to the root directory of your parallel source trees for your prose written in markdown and your java tests.


## Settings for tokens to filter ##

The configuration file also defines a map of token names to values that will be substituted for them when markdown source files are converted to HTML.  The sample template includes tokens named `openex` and `closeex` that have HTML markup to open and close a `div` with a class attribute that is recognized by concordion's default CSS to set off examples from other content in your text.  See the template project for an example of usage.

You can add any tokens you like to this map, and include them in your source with the normal gradle token notation.  For example, if you added this mapping

    "lic" : "This work is licensed under a Creative Commons Attribution-ShareAlike 4.0 International License"

you could include a license statement in your markdown by including the string `@lic@` anywhere in your markdown source.
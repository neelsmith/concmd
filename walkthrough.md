---
layout: page
title: Walkthrough of a working project
---


## Overview of the template project ##

If you have not aleady gotten a copy of the template project, get one now from the github repository <https://github.com/neelsmith/concmd>.  You can clone it, or use the link there to download a zip file with a working project.

In its root directory, you'll find a `build.gradle` file that defines the gradle task `conc`.   Within the directory named `writing`, you'll see two parallel directory structures with the  content necessary for concordion testing:  `md` has your prose written in markdown; this is paralleled by java tests in the `java` directory.  When you run `gradle conc`, your writing is first converted to HTML, then tested with concordion.  If this succeeds, the final, formatted web pages will be in `build/concordion-formatted`.



## Comparing markdown source with formatted output

There is only one markdown file in the template project: open `writing/md/yourProject/YourProject.md` in a text editor, and the corresponding `build/concordion-formatted/yourProject/YourProject.html` in a web browser.

You'll see that `YourProject.md` is completely generic markdown, with two kinds of additions:

1. During the gradle build, token names bracketed by `@` signs are replaced by values defined in `build.gradle`.  For details on how to define your own tokens, see the [advanced user guide: configuration and formatting options](../advanced).
2. HTML elements with attributes in the concordion name space define variables to use in tests, and tests to execute.  This is where you make your prose a living, testable document.


Since John Gruber's initial definition, markdown has always allowed including HTML tags in a markdown document.  In the example file, two `em` elements include a `concordion:set` attribute that defines a variable name.  When the concordion tests are run, the variables are assigned the text content of the element they annotate.  (The concordion-namespaced attributes may be used on any HTML element you like.) One `em` element is given a string value `Hello`, and the other an integer value `3`.

The markdown text also includes an HTML `strong` element that uses  the `concordion:assertEquals` to test our prose.  The attribute supplies our previously named variables to a method named `echo` defined to our test fixture in its attribute value `echo(#str, #count)`.  When concordion tests this span of text, it verifies that the return value of the `echo` method matches the text content of this element (in this case, "Hello, Hello, Hello").





## Adding your own content: gotchas to look out for ##

You can put your own markdown and test fixtures in the provided directory, and use `gradle conc` to test and format your writing.  Concordion expects exactly corresponding names in the prose text and the source code for testing.  `concmd` converts files named `<FILE>.md ` to corresponding files `<FILE>.html`, so be sure your markdown file name matches the names in your testing code.  (If your test code is in java, this means, too, your class and package names must correspond exactly to the directory hierarchy.)

It is easy to insert invalid XML in a markdown document.  If your XML is not well-formed, concordion will reject it with a depressingly generic-looking message.  The gradle error logs, however, will give you a precise description of what XML was rejected (in `build/reports/test`).

If your XML is well-formed, but you mistype the concordion-namespaced attribute, concordion will pass by your prose and assume it is generic text.   This could result in a test not being run (e.g., if you mistype the `concordion:assertEquals` attribute), or an error resulting from a test being applied to an undefined variable (e.g., if  `concordion:set` is mistyped).






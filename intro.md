---
layout: page
title: Introduction and rationale
---

## Testing prose with machines ##


Software developers need to ensure that what a program actually does agrees with the prose of documentation or specifications.  One technique to help keep prose and program output aligned uses *acceptance testing* systems.    Typically, these systems let you define tests within the same document that specifies how the program operates.  The system runs the tests, and incorporates the results in a re-formatted version of the document.

[Concordion](concordion.org) is an acceptance testing system that includes two significant generalizations of this idea:

1. While most acceptance testing systems require you to express tests in a rigidly structure syntax:  concordion allows you to attach tests to any span of your prose.
2. Most testing systems are designed to work with a single programming language:  concordion abstracts the connection between prose text and testing code, so that at present you can choose from half a dozen programming languages to execute your tests.


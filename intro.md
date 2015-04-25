---
layout: page
title: "Background: testing prose with machines"
---


## Testing technical documents ##




Software developers need to ensure that what a program actually does agrees with the prose of documentation or specifications.  One technique to help keep prose and program output aligned uses *acceptance testing* systems.    Typically, these systems let you define tests within the same document that specifies how the program operates.  The system runs the tests, and incorporates the results in a re-formatted version of the document.

[Concordion](concordion.org) is an acceptance testing system that includes two significant generalizations of this idea:

1. While most acceptance testing systems require you to express tests in a rigidly structure syntax, concordion allows you to attach tests to any span of your prose.
2. Most testing systems are designed to work with a single programming language:  concordion abstracts the connection between prose text and testing code, so that at present you can choose from half a dozen programming languages to execute your tests.


## Testing scholarly prose ##


A system letting you apply tests written in any of various langauges to any span of text in a prose document can serve much wider needs than just testing programmers' specifications:  it can serve as a generic infrastructure for automated testing of prose.

This is in fact a fundamental need in digital scholarly work:  like programmers, we need a way to verify that what scholarly prose claims actually agrees with what a digital scholarly system does.  Concordion is one system that now provides the previously missing technological infrastructure to write testable scholarship.


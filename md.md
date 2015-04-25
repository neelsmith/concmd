---
layout: page
title: Testing prose written in markdown
---

Concordion lets us [write testable prose](../intro), but it expects input in HTML.  In 2015, however, human beings should not have to compose HTML manually:  it has essentially become a read-only format for fluid layouts that machines can generate, in the same way that PDF is a machine-generated format for fixed-size pages that no one writes by hand.

Markdown is  a widely used light-weight notation that can represent essentially the same semantics of a text as HTML, and parsers to convert markdown to HTML are abundant.  Behind the scenes, this project uses René Jeschke's `txtmark` parser to convert markdown to HTML, and adds the necessary XML namespace declarations for concordion to run its tests.  The result is that you can work with your prose exclusively in markdown, and let the build system feed the proper HTML to concordion.

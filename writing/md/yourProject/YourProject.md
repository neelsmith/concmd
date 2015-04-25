# Template for writing concordion specifications in markdown, version @version@ #

This template illustrates how to write prose in markdown.  To apply concordion actions to part of your text, use an hmtl tag you like (as markdown routinely permits) with the appropriate attribute in the concordion namespace.  See the [`concmd` user's guide](http://neelsmith.github.io/concmd/) for full instructions.

In addition to text in markdown, the template includes a trival java fixture that echoes a given string a specified number of times.


@openex@

### Example ###


Use concordion's `concordion:set` attribute to two define two variables, and assign one a string value <em concordion:set="#str">Hello</em>, and the other an integer value <em concordion:set="#count">3</em>.

We can then use the `concordion:assertEquals` attribute to provide these variables to our test fixture.  The fixture contains an `echo` method, that should yield <strong concordion:assertEquals="echo(#str, #count)">Hello, Hello, Hello</strong>.

@closeex@

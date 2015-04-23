# Template for writing concordion specifications in markdown, version @version@ #

Write prose in markdown.  To apply concordion actions to part of your text, use an hmtl tag you like (as markdown routinely permits) with the appropriate attribute in the concordion namespace.


@openex@

### Example ###

Look at the source markdown and the fixture implementation in java to see how this works.

If we set a variable's value <em concordion:set="#str">Hello, markdown</em>, we can use it in tests.

Echoing the emphasized text above should yield, <strong concordion:assertEquals="echo(#str)">Hello, markdown</strong>.

@closeex@

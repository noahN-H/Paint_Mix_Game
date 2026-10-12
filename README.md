**DISCLAIMER:** This project is a coursework project - the program is written with specific guidelines and practices in place.

# Premise
The Paint Mixer is a game where the user takes the role of a master artist assistant. For her latest work, the artist needs to get her subjects eyes just right: too dull and the picture will not capture the viewer's attention, too bright and the picture will look like a cheap postcard.

As her Apprentice, the user must work on finding the right colour. They will propose a mixture of source colours to the artist who will be able to give some feedback on the final result. In particular they can say:

- how many source colours are good and in the right quantity
- how many are okay, and should appear in the mix, but are currently in the wrong quantity

With this feedback the user can refine their mixture until the right colour is found.

The colours in the artist workshop is:
- Apple white
- Blueberry blue
- Cranberry red
- Durian yellow
- Elephant grey
- Forest green

We use letters A, B, C, D, E, F to represent them, and use the order of the sequence to represent the quantity of each (position 1 = 1 teaspoon (tsp), position 2 = 2 tsp, etc.)

For example
`ACBFD`
represents a mix with 1 tsp of apple white, 2 tsp of cranberry red, 3 tsp of blueberry blue, 4 tsp of forest green, and 5 tsp of durian yellow.

Suppose the master artist was looking for mix:
`BAFDE`
if the user played
`BFADC`

the artist would say:
- two colours are good and in the right quantities (B and D)
- two colours are okay, but given in the wrong quantities (A and F)

This cycle will repeat until the entire mix is correct.
An example run is bellow:

    > Previous attempts:
    > No previous attempts
    > Enter paint mix:
    < BFADC
    > Previous attempts:
    > BFADC (Good 2, Wrong quantity 2)
    > Enter paint mix:
    < BFAEJ
    > Invalid paint mix!
    > Enter a paint mix:
    < BFAEE
    > Previous attempts:
    > BFAEE (Good 1, Wrong quantity 3)
    > BFAEC (Good 2, Wrong quantity 2)
    > Enter paint mix:
    < CFADE
    > Previous attempts:
    > CFADE (Good 2, Wrong quantity 2)
    > BFAEE (Good 1, Wrong quantity 3)
    > BFAEC (Good 2, Wrong quantity 2)
    > Enter paint mix:
    < BAFDE
    > Congratulations!


# To run/verify
To play you need to compile using `$ javac *.java` then run `$ java PaintAssistantCli`

To verify Paint Tester you need 'PaintTester.jar'. it can be run using:
`$ java -jar PaintTester.jar`

note: JDK has to be installed for the program to run

The program uses techniques including: 
- custom singly-linked lists
- class separation
- input validation

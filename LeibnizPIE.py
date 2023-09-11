"""
Greetings Professor... jeff cope cit144 exercise 3.6                         ** * * * * * * ** * * * * * * * * * * * *
it is now 11:34pm tuesday, september 5th 2023 Anno Domini                   *             *                 *
                                                                                          *                 *
The German mathematician Gottfried Leibniz developed                                      *                 *
the following method to approximate the value of π:                                       *                 *
                                                                                          *                 *
π/4 = 1/1 - 1/3 + 1/5 - 1/7 + 1/9 -1/11. . .                                              *                 *
                                                                                          *                 *
this program allows the user to specify                                                   *                  *         *
the number of iterations used in this approximation                                   * *                     *     *
and then displays the resulting value.


                                               thank you for using
"""

numerator = 1
iterations = int(input("Enter the number of iterations: "))
quaterPIE = 0

for denominator in range(1,iterations*2,2):
    quaterPIE += numerator/denominator
    numerator = - numerator

print("The approximation of pi is",quaterPIE * 4)

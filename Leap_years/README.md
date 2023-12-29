# Leap Years

## Order

This short and simple Kata should be performed in pairs using Test Driven Development (TDD).

Prior to 1582, the Julian Calendar was in wide use and defined leap years as every year divisible by 4. However, it was found in the late 16th century that the calendar year had drifted from the solar year by approximately 10 days. The Gregorian Calendar was defined in order to thin out the number of leap years and to more closely align the calendar year with the solar year. It was adopted in Papal countries on October 15, 1582, skipping 10 days from the Julian Calendar date. Protestant countries adopted the Gregorian Calendar after some time.

The Gregorian Calendar is quite accurate, but could be made more accurate by adding an additional rule that eliminates years divisible by 4000 as leap years. But I guess we’ll cross that bridge when we come to it. Consider adding this rule as a second story as an extension to the exercise.

User Story:

As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.

Acceptance Criteria:

* All years divisible by 400 are leap years (so, for example, 2000 was indeed a leap year),
* All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
* All years divisible by 4 but NOT by 100 ARE leap years (e.g., 2008, 2012, 2016),
* All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).

## Dependencies

This project is a java 21 project with 3 libraries:
* junit jupiter
* assertj
* maven-surefire-plugin

## Constraints to execute this kata

Principle of a kata is to be repeated to increase our skills in development, but just repeat the same exercise without objective can be lazy, so I propose you to have little objectives each time you repeat this kata. These objectives are so generic, so they can be operated for others kata.

This kata has been created to improve our competence to do TDD, so that's the first constraint is that you have to use TDD each time you do it.

Second constraint will be to optimize code by doing :
* a maximum variable
* having the least repeated code at the end.
* optimized iterations (as if-else)

Third constraint should be to minimize the time to code :
* less than an hour first
* less than 30 min second
* less than 15 min third
* ... and so on if you can

Fourth constraints should be to do it in another language after well understanding.

## Advance

Doing a kata is more interesting when you do it by pair programming.

Pair allows to :
* Highlight misunderstanding about order
* Take a step back to the problem and find easily solutions
* Highlight different methods to solve the kata

If you can do your kata with someone else at least once that should be great !
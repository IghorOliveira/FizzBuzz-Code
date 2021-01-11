# FizzBuzz-Code

This is a thought exercise presented in a Tom Scott video.

Tom Scott is a Web Developer and Internet Content Creator, he post a video on his youtube channel called "FizzBuzz: One Simple Interview Question" where he explained an blog post from a friend of him named Imran in which he proposed a simple but nuanced test, write some code that can play the childrens game FizzBuzz, and then Tom proceeded to explain the basic thought proccess of the problem and iterated a bit on it to then end the video sayng that his code could be improved on, so I decided to try that. 

My code assumes that the user is actually trying to play the game correctly, it will ask for the number of turns in the game, which numbers will be present and what is the word that will go with it. It doenst seem like anything special but it is very scalable, with two arraylist in sinc the user can put as many inputs as desired, even more then one word for an especific number and it will work (that last part was trick since if two or more number are multiples of the current number then the code must display all the words inputed for these numbers).

# Homework 5
Moving average is defined here:
https://en.wikipedia.org/wiki/Moving_average
Associated with the simple moving average (SMA), is the concept of exponential smoothing:
https://en.wikipedia.org/wiki/Exponential_smoothing
One such example is in Q learning:
https://en.wikipedia.org/wiki/Q-learning (See how the Q values are being updated)
An exponential moving average (EMA) is a type of moving average (MA)
that places a greater weight and significance on the most recent data points.


1. Using the techqniue of sliding window as shown on page 49 of our textbook, to
create a scala function to compute the SMA of a list of stock prices. (10 pts)

2. Using the techqniue of sliding window as shown on page 49 of our textbook, to
create a scala function to compute the EMA of a list of stock prices. (10 pts)

3. On page 88, there is one example of counting the non-leaf nodes in a binary tree. Your task
is to convert this function into a tall recursion. (10 pts)

4. On page 89, there is one example of computing the depth of a binary tree. Your task
is to convert this function into a tall recursion. (10 pts)

5. On page 95, the book introduces three binary tree traversals. There is another popular tree traversal
called level order traversal. Could you find out its definition and implement it? (10 pts)


6. Create a function to find the max and min values of a BST, which has its key and value of the same
integer value. Your function will return a tuple (min, max). (10 pts)


def SMA(window: List[Double]) = window.sum/window.length

val days = List(1.1, 1.2, 2.3, 4.5, 1.1, 1.6, 1.9, 2.3, 2.2, 1.1)
val s_values = days.sliding(7,1).toList.map(x => SMA(x))

def EMA(window: List[Double], alpha: Double) = {
var sum = window(0)
for (index <- 1 until window.length)
sum = alpha*window(index) + (1 - alpha)*sum

sum
}

val alpha = 0.9
val e_values = days.sliding(7,1).toList.map(x => EMA(x, alpha))

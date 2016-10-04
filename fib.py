# An itterative approach
def fibSeq(n):
	if (n < 2):
		return 1
	prev1 = 1
	prev2 = 1
	for i in range(1, n):
		temp = prev2
		prev2 = prev1 + prev2
		prev1 = temp
	return prev2
  
  
# A Recursive approach
def fib(n):
	if (n < 2):
		return 1
	return fib(n - 1) + fib(n - 2)

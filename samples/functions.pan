def add = function(a, b)
  return a + b
end

def square = (a) => return a*a end

square(10)
add((20 + 30), square(10))

// semantic errors
// add(1)
// square(1, 2)


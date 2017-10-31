def var = 10

def some = function(a, b)
  def foo = 10

  if a > b then
    def bar = 20
    foo = 100 + bar
  end

  // Semantic error
  // bar = 40

  return foo + a + b
end

// Semantic error
// foo = 20
// bar = 40

// Comentários são iguais ao do C e java

/* Blocos de comentários
 * também seguem os mesmo modelo
 */

// Variáveis são definidas pela keyword 'def'

def foo = 'String'
def foo, bar = 'String', 20
def somaMult = (20 + 20) * 2

// Funçôes podem ser definidas por defn

defn sum(a, b)
  return a + b
end

// Tambem pode ser definido por function e atribuido a uma variavel

def new_sum = function(a, b)
  return a + b
end

// Novo modelo de declarar funcao com arrow function

def sub = (a, b) => return a - b end

defn exec(func, a)
  return func(a)
end

def result = exec((a) => return a*a end, 10)

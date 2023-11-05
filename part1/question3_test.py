from question3 import make_oven,alchemy_combine 


def test_alchemy_combine():

  assert alchemy_combine(
    make_oven(),
    ["lead", "mercury"],
    5000
  ) ==  ['Hervirlead', 'Hervirmercury']

  assert alchemy_combine(
    make_oven(),
    ["water", "air"],
    -100
  ) == ['Congelarwater', 'Congelarair']

  assert alchemy_combine(
    make_oven(),
    ["cheese", "dough", "tomato"],
    150
  ) == ['Hervircheese', 'Hervirdough', 'Hervirtomato']
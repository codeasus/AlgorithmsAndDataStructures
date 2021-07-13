class Food: 
    def __init__(self):
        pass

class Pizza(Food): 
    '''Enter the names of the ingredients as a list in the constructor'''
    def __init__(self, ingredients = None):
        if ingredients is not None: 
            self.ingredients = ingredients
        else: 
            self.ingredients = []
    
    def showRecipe(self): 
        for number, ingredient in enumerate(self.ingredients):
            print('[{}] -> {}'.format(number, ingredient))

class Pancake(Food):
    '''Enter the names of the ingredients as a list in the constructor'''
    def __init__(self, ingredients = None):
        if ingredients is not None: 
            self.ingredients = ingredients
        else: 
            self.ingredients = []
    
    def showRecipe(self): 
        for number, ingredient in enumerate(self.ingredients):
            print('[{}] -> {}'.format(number, ingredient))


def factory(orderType='pizza', ingredients=None):
    orders = {'pizza': Pizza(ingredients), 'pancake': Pancake(ingredients)}
    order  = orders.get(orderType) if orderType in orders else f'We do not serve {orderType}'

    return order

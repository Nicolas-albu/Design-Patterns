from functools import wraps


def singleton(class_original):
    new_of_class_original = class_original.__new__ #__new__ retornar a instância recém-criada
    same_instance = None
    
    #Sobrescrevendo o método __new__
    @wraps(class_original.__new__)
    def __new__(cls, *args, **kwargs):
            nonlocal same_instance
            if same_instance is None:
                same_instance = new_of_class_original(cls, *args, **kwargs)
            return same_instance
        
    class_original.__new__ = __new__
    return class_original


@singleton
class TestSingleton:
    def __init__(self):
        print(self)

if __name__ == "__main__":
    primeiroSingletom = TestSingleton()
    segundoSingleton = TestSingleton()
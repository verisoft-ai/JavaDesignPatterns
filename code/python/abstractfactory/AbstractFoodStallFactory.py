from abc import ABC, abstractmethod

from IceCream import IceCream
from Pizza import Pizza


class AbstractFoodStallFactory(ABC):
    @abstractmethod
    def createIceCream(self) -> IceCream:
        pass

    @abstractmethod
    def createPizza(self) -> Pizza:
        pass

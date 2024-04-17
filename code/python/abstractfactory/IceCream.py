from abc import ABC, abstractmethod


class IceCream(ABC):
    @abstractmethod
    def enjoy(self):
        pass

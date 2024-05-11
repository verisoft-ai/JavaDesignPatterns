from abc import ABC, abstractmethod


class Pizza(ABC):
    @abstractmethod
    def bake(self):
        pass

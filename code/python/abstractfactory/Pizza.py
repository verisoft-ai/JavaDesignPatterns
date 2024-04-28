from abc import ABC, abstractmethod


class Pizza(ABC):
    @abstractmethod
    def enjoy(self):
        pass
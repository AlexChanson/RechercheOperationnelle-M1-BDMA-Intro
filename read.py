def load_instance(file):
    with open(file) as f:
        n = int(f.readline())
        D = []
        for i in range(n):
            d = []
            for e in f.readline().split(" "):
                d.append(float(e))
            D.append(d)
    return n, D


class TspInstance:

    def __init__(self, file):
        n, D = load_instance(file)
        self.file = file
        self.size = n
        self.dist = D

    def __repr__(self) -> str:
        return "TSP Instance of Size " + str(self.size) + " from '" + self.file + "'"

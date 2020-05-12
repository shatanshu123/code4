class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        if len(coordinates) <= 2:
            return True

        for i in range(3,len(coordinates)):
            #compare product of the other points: (x[i] - x[0])*(y[i] - y[1]) with (x[i] - x[1])(y[i] - y[0])
            if (coordinates[i][0] - coordinates[0][0])*(coordinates[i][1] - coordinates[1][1]) != (coordinates[i][0] - coordinates[1][0])*(coordinates[i][1] - coordinates[0][1]):
                return False
        return True

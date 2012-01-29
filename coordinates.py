#Brute forcing the center points for all of the hexagons

import math 

class Point():

    def __init__(self, x, y):
        self.x = x 
        self.y = y

side_length = 69.28
radius = 60 #Radius is defined as distance from center to midpoint of edge
i = math.pi / 2
increment = 0
inner = 1 
outer = 8
point_dic = {}

while increment < 6:
    point_dic[inner] = Point(2 * radius * math.cos(i), 2 * radius * math.sin(i))
    point_dic[outer] = Point(4 * radius * math.cos(i), 4 * radius * math.sin(i))
    i -= math.pi/12
    outer += 1
    point_dic[outer] = Point((2 * radius + side_length) * math.cos(i), (2 * radius + side_length) *math.sin(i))
    inner += 1
    outer += 1
    i -= math.pi/12
    increment += 1


for val in point_dic.keys():
    print("{0}: ({1}, {2})".format(val, point_dic[val].x, point_dic[val].y))
    

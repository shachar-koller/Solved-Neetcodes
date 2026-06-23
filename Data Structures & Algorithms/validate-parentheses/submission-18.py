class Solution:
    def isValid(self, s: str) -> bool:
        stacky = []
        strLen = len(s)
        if strLen % 2 != 0:
            return False
        for c in s:
            if(c in "{[("):
                stacky.append(c)
            else:
                popped = ""
                if len(stacky) != 0:
                    popped = stacky.pop()
                else:
                    return False
                if(c == "]" and popped != "["):
                    return False
                if(c == ")" and popped != "("):
                    return False
                if(c == "}" and popped != "{"):
                    return False
        if len(stacky) == 0:
            return True
        else:
            return False
        
        
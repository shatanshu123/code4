class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        l = 0
        d = {}
        for c in p:
            d[c] = d.get(c,0) + 1
            l += 1
            
        i = 0
        ln = 0
        ds = {}
        res = []
        for c in s:
            if c not in d:
                ds = {}
                ln = 0
                i += 1
                continue
            ds[c] = ds.get(c, 0) + 1
            
            ln += 1
            if ln == l:
                if d == ds:
                    res.append(i-ln+1)
                ln -= 1
                ds[s[i-ln]] -= 1
                if ds[s[i-ln]] == 0:
                    del ds[s[i-ln]]
                
            i += 1
        return res

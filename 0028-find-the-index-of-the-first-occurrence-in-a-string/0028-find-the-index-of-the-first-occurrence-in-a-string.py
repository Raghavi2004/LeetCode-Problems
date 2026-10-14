class Solution:
    def strStr(self, haystack, needle):
        if needle in haystack:
            return haystack.find(needle)
        return -1
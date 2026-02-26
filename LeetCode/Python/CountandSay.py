{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "3727165d",
   "metadata": {},
   "outputs": [],
   "source": [
    "class Solution:\n",
    "    def countAndSay(self, n: int) -> str:\n",
    "        res = \"1\"\n",
    "        for _ in range(n - 1):\n",
    "            temp, i = \"\", 0\n",
    "            while i < len(res):\n",
    "                count = 1\n",
    "                while i + 1 < len(res) and res[i] == res[i + 1]:\n",
    "                    i += 1\n",
    "                    count += 1\n",
    "                temp += str(count) + res[i]\n",
    "                i += 1\n",
    "            res = temp\n",
    "        return res\n",
    "    "
   ]
  }
 ],
 "metadata": {
  "language_info": {
   "name": "python"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}

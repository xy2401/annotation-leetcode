# word-frequency

统计词频



[统计词频 (Word Frequency) - 领扣 (LeetCode)](https://leetcode-cn.com/problems/word-frequency/description/)
[Word Frequency - LeetCode](https://leetcode.com/problems/word-frequency/description/)

# case

使用火狐 将 [spring-framework Core Technologies](https://docs.spring.io/spring-framework/docs/5.0.9.RELEASE/spring-framework-reference/core.html) 保存为纯文本(不含html标签) , 统计词频，以便  和快速熟悉关键字 和 背单词

基础单词 : the 4205 to 1943 a  1821 of 1514    
相关单词 : bean 650 Spring 634 class 398 method 381 configuration 221    

# Solution  

[My simple solution (one line with pipe) - LeetCode Discuss](https://leetcode.com/problems/word-frequency/discuss/55443/My-simple-solution-(one-line-with-pipe))

    cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2, $1 }'

tr -s: truncate the string with target string, but only remaining one instance (e.g. multiple whitespaces)
  
  使用回车替换空格

sort: To make the same string successive so that uniq could count the same string fully and correctly.
  
  每行数据排序

uniq -c: uniq is used to filter out the repeated lines which are successive, -c means counting

  过滤重行并且计数

sort -r: -r means sorting in descending order
 
 再排序

awk '{ print $2, $1 }': To format the output, see here.

格式化输出


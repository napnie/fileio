# File IO by Nitith Chayakul

Result from running FileCopyTask on ASUS TP301UJ

|Task                                         | Elapsed time|
|:--------------------------------------------|------------:|
|Copy a file byte-by-byte                     | 7.751829 sec|
|Copy file 1KB at a times                     | 0.009540 sec|
|Copy file 4KB at a times.                    | 0.003492 sec|
|Copy file 64KB at a times                    | 0.001612 sec|
|Copy file one line of text at a times        | 0.057517 sec|

From the this result, we can see that by divide the file into several blocks and copies them at a times run far faster than copies them one by one.

Suppose the data is thousand of block contain in a single file and we want to copy them into another file, we can transfer them one by one. It would take so much time because we need to carries these block thousand of times even if you need to carries one single block each times. we can also carries multiples blocks each time we transfer them like 10 blocks at a time. It would be heavier than carries it one by one but you only need to do it for only hundred time which make it far faster than the first method.

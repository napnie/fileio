# File IO by Nitith Chayakul

Result from running FileCopyTask on ASUS TP301UJ

|Task                                         | Elapsed time|
|:--------------------------------------------|------------:|
|Copy a file byte-by-byte                     | 7.721644 sec|
|Copy file 1KB at a times                     | 0.009624 sec|
|Copy file 4KB at a times.                    | 0.003740 sec|
|Copy file 64KB at a times                    | 0.001598 sec|
|Copy file one line of text at a times        | 0.051893 sec|

From the this result, we can see that by divide the file into several blocks and copies them at a times run far faster than copies them one by one.

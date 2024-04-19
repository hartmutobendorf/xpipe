## イニシャルスクリプト

シェルのinitファイルとプロファイルが実行された後に実行するオプションのコマンド。

これを通常のシェルスクリプトとして扱うことができる。つまり、シェルがスクリプトでサポートするすべての構文を利用することができる。実行するコマンドはすべてシェルがソースとなり、環境を変更する。例えば変数を設定すれば、このシェルセッションでその変数にアクセスできる。

### コマンドをブロックする

ユーザー入力を必要とするブロックコマンドは、XPipeがバックグラウンドで最初に内部的に起動したときにシェルプロセスをフリーズさせる可能性があることに注意すること。これを避けるには、変数 `TERM` が `dumb` に設定されていない場合にのみ、これらのブロックコマンドを呼び出すこと。XPipeはバックグラウンドでシェルセッションを準備するときに自動的に変数`TERM=dumb`を設定し、実際にターミナルを開くときに`TERM=xterm-256color`を設定する。
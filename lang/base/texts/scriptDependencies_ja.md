## スクリプトの依存関係

最初に実行するスクリプトとスクリプトグループ。あるグループ全体を依存関係にした場合、そのグループに含まれる すべてのスクリプトが依存関係とみなされる。

解決されたスクリプトの依存グラフは、平坦化され、フィルタリングされ、一意になる。つまり、互換性のあるスクリプトだけが実行され、スクリプトが複数回実行される場合は、最初の1回だけが実行される。
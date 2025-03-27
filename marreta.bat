for /f %%a in ( 'git status -s' ) do set "GIT_STATUS=%%a"
echo %GIT_STATUS%
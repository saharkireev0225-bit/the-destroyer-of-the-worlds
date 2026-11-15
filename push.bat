$batScript = @'
@echo off
chcp 65001 >nul
echo =========================================
echo       Автоматический коммит и пуш
echo =========================================
set /p commit_msg="Введи сообщение коммита (или нажми Enter для 'update'): "

if "%commit_msg%"=="" set commit_msg=update

echo.
echo Добавляем файлы...
git add .

echo.
echo Делаем коммит...
git commit -m "%commit_msg%"

echo.
echo Отправляем на GitHub...
git push

echo.
echo Готово!
pause
'@

[System.IO.File]::WriteAllText("$pwd\push.bat", $batScript, (New-Object System.Text.UTF8Encoding($false)))
Write-Host "Файл push.bat успешно создан!" -ForegroundColor Green
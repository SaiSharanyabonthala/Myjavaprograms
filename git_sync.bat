@echo off
:: Change the path below to your actual Java programs folder
cd /d "C:\devi\javaprgms\Myjavaprograms"

:: Pull changes first to prevent errors
git pull origin main

:: Add, Commit, and Push
git add .
git commit -m "Automated backup: %date% %time%"
git push origin main
# Baixe o arquivo ZIP mais recente do OWASP ZAP
wget -O zap.zip $(wget -q -O - https://api.github.com/repos/zaproxy/zaproxy/releases/latest | jq -r '.assets[].browser_download_url' | grep -E 'ZAP_WEEKLY_D.*\.zip')

# Extraia o arquivo ZIP para /usr/share
sudo unzip -d /usr/share zap.zip

# Renomeie a pasta extraída para um nome mais amigável
sudo mv /usr/share/ZAP* /usr/share/zap

# Remova o arquivo ZIP baixado
rm zap.zip

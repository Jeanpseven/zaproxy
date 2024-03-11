# Baixe o arquivo ZIP mais recente do OWASP ZAP
curl -L $(curl -s https://api.github.com/repos/zaproxy/zaproxy/releases/latest | grep browser_download_url | cut -d '"' -f 4 | grep -E 'ZAP_WEEKLY_D.*\.zip') -o zap.zip

# Extraia o arquivo ZIP para /usr/share
sudo unzip -d /usr/share zap.zip

# Renomeie a pasta extraída para um nome mais amigável
sudo mv /usr/share/ZAP* /usr/share/zap

# Remova o arquivo ZIP baixado
rm zap.zip

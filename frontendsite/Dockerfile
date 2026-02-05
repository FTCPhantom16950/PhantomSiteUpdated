# Сборка
FROM node:18-alpine AS build
WORKDIR /app

# Копируем package.json и package-lock.json (вместо yarn.lock)
COPY package.json package-lock.json ./

# Устанавливаем зависимости через npm ci (Clean Install - быстрее и надежнее для CI)
RUN npm ci

COPY . .

# Собираем проект
RUN npm run build

# Раздача через Nginx
FROM nginx:alpine
COPY --from=build /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
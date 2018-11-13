import requests
from bs4 import BeautifulSoup
# from selenium import webdriver

# driver = webdriver.Chrome()
# driver.get("https://www.supremenewyork.com/shop/new")
# product = driver.find_element_by_class('inner-article')
# product.click()

# Fetch Supreme's website (New products page)
page = requests.get('https://www.supremenewyork.com/shop/new')
soup = BeautifulSoup(page.text, 'html.parser')  # Create BS object

# item_path = soup.find(class_="inner-article")
# print(item_path)
# item_path.img.decompose()
# print(item_path)
for link in soup.find_all('a'):
    if(link.get('href') != "shop"):
        print("http://www.supremenewyork.com" + link.get('href'))

# for link in soup.find_all('article'):
#     print(link.get('href'))

# last_links = soup.find(class_='inner-article')
# last_links.decompose()

# artist_name_list = soup.find(class_='s')
# artist_name_list_items = artist_name_list.find_all('a')

# # Use .contents to pull out the <a> tag’s children
# for artist_name in artist_name_list_items:
#     names = artist_name.contents[0]
#     print(names)

# Gets ceiling of number
# import math
# x = math.ceil(4.5/2)
# print(x)

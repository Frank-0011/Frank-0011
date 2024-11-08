import matplotlib.pyplot as plt
import pandas as pd
from arabic_reshaper import reshape
from bidi.algorithm import get_display

plt.style.use("ggplot")
plt.title("Digikala dataset")

#<<---------------------کار با دیتا ست های بزرگ----------------------->>#


#خواندن دیتا ست
dataset = pd.read_csv("orders.csv")
#print(dataset.shape)

#پیدا کردن شهر ها و تعداد اونها
locations = dataset["city_name_fa"]
orders = locations.value_counts()

#گرفتن key و value
orders = orders.to_dict()

key = list(orders.keys())[:20]
value = list(orders.values())[:20]
value.reverse()
key.reverse()
corrected = [get_display(reshape(value)) for value in key]

#پلات کردن

plt.rc("xtick" , labelsize = 8)
plt.rc("ytick" , labelsize = 12)

plt.barh(corrected , value)
plt.show()
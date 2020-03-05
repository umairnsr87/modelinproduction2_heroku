import os
#print(os.getcwd())

import pandas as pd
import numpy as np

from sklearn.linear_model import LogisticRegression



# create df
train = pd.read_csv('titanic.csv')

# drop null values
train.dropna(inplace=True)

# features and target
target = 'Survived'
features = ['Pclass', 'Age', 'SibSp', 'Fare']

# X matrix, y vector
X = train[features]
y = train[target]

# model
model = LogisticRegression()
model.fit(X, y)
model.score(X,y)

import pickle
pickle.dump(model, open('model.pkl', 'wb'))


#testing the request
import requests
import json

url = 'http://127.0.0.1:5000'

# test data
data = {  'Pclass': 3
             , 'Age': 2
             , 'SibSp': 1
             , 'Fare': 50}

data = json.dumps(data)
print(data)


send_request=requests.post(url,data)

print(send_request.json())
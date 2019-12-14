from flask import *
app = Flask(__name__)

@app.route('/')
def index():
    return 'Index Page'

@app.route('/hello')
def hello():
    return 'Hello, World'

@app.route("/getbyid",methods=['GET'])
def harmony():
    if request.method == 'GET' and request.args.get('id')!=None :
        inp = request.args.get('id')
        users = extract_harmony(int(inp))
        return jsonify(users)
    else:
        page_not_found()

def extract_harmony(id):
    l=[{"id":"1","name":"vamsi","gender":'m',"contactno":'1234567189',"address":'qwrtyad adfaf',"pickupaddress":'qwerty ioadfaf'},
       {"id":"2","name":'shiva',"gender":'m',"contactno":'3456789110',"address":'qweryad adfaf',"pickupaddress":'qwery iopadfaf'},
       {"id":"3","name":'venkatesh',"gender":'m',"contactno":'1219156789',"address":'ertyasd adfaf',"pickupaddress":'qwrty iopadfaf'},
       {"id":"4","name":'abhishek',"gender":'m',"contactno":'1243516789',"address":'qwetyasd afaf',"pickupaddress":'qwery iopadfaf'},
       {"id":"5","name":'raghavendra',"gender":'m',"contactno":'1213546789',"address":'qwrtyasd adfaf',"pickupaddress":'qwerty opadfaf'},
       {"id":"6","name":'yaswant',"gender":'m',"contactno":'1234561789',"address":'qwrtyasd dfaf',"pickupaddress":'qwerty iopdfaf'},
       {"id":"7","name":'SES',"gender":'m',"contactno":'1234567819',"address":'qwrtyasd adfaf',"pickupaddress":'qwerty iopdfaf'},
       {"id":"9","name":'PEP',"gender":'m',"contactno":'112345789',"address":'qwertasd adfaf',"pickupaddress":'qwerty ipadff'}
    ]
    obj={"id":"0","name":'infy',"gender":'f',"contactno":'1234567891',"address":'qwetyasd adff',"pickupaddress":'qwrty opadfaf'}
    for i in l:
        if int(i.get('id'))==id:
            obj=i
    #print(id,obj)
    return obj

@app.route("/getbycldprj",methods=['GET'])
def alcon():
    if request.method == 'GET' and request.args.get('chpc')!=None :
        inpa = request.args.get('chpc')
        users = extract_alcon(inpa)
        return jsonify(users)
    else:
        page_not_found()
    
def extract_alcon(inpai):
    r=[{'projectcode':'Mso365St','emailid':'moh.kar'},
    {'projectcode':'Msl20hsz','emailid':'alek.gor'},
    {'projectcode':'Tel365','emailid':'shiv.kar'},
    {'projectcode':'Krft89Nz','emailid':'yas.mam'}]
    obj={'projectcode':'Mslhvnzz','emailid':'aud.red'},
    for i in r:
        if (i.get('projectcode'))==inpai:
            obj=i
    #print(id,obj)
    return obj

@app.errorhandler(404)
def page_not_found(e):
    print('Error encountered')
    return 'Encountered Error', 404

#if __name__ == '__main__':
#    app.run()

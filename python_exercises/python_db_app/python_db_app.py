import sys
import psycopg2

def database_info(host,port,username,password,database,table,out_file):

    #conn = psycopg2.connect(database="exercises",host="localhost",user="postgres",password="1234",port="5432")
    conn = psycopg2.connect(database=database,host=host,user=username,password=password,port=port)
    cursor = conn.cursor()
    query="SELECT * FROM "+table
    outputquery = "COPY ({0}) TO STDOUT WITH CSV HEADER".format(query)

    with open(out_file+'.csv','w') as f:
        cursor.copy_expert(outputquery,f)

    conn.close()
    return None





def main():
    host=sys.argv[1]
    port=sys.argv[2]
    username=sys.argv[3]
    password=sys.argv[4]
    database=sys.argv[5]
    table=sys.argv[6]
    out_file=sys.argv[7]
    #database_info(host=None,port=None,username=None,password=None,database=None,table=None,out_file=None)
    #conn = psycopg2.connect(database="exercises",host="localhost",user="postgres",password="1234",port="5432")
    database_info(host=host,port=port,username=username,password=password,database=database,table=table,out_file=out_file)


    

if __name__ == "__main__":
    main()
    
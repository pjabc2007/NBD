import json
import riak


def load_file(path):
    with open(path) as f:
        return json.load(f)


def main(path):
    file = load_file(path)
    riak_client = riak.RiakClient(pb_port=8087)
    riak_bucket = riak_client.bucket('s16682')

    # Dodawanie dokumentu
    riak_bucket.new(file['vin'], file).store()
    res = riak_bucket.get(file['vin'])
    print('Dodano, a nastepnie pobrano dokument: {}'.format(res.data))

    # Modyfikacja dokumentu
    res.data['isSold'] = True
    res.store()

    res_modify = riak_bucket.get(file['vin'])
    print('Zmodyfikowano, a nastepnie pobrano dokument: {}'.format(res_modify.data))

    # Usuniecie dokumentu
    res_modify.delete()

    # Proba pobrania usunietego dokumentu
    red_del = riak_bucket.get(file['vin'])
    print('Usunieto, a nastepnie sprobowano pobrac dokument: {}'.format(red_del.data))


if __name__ == '__main__':
    main(path='document.json')


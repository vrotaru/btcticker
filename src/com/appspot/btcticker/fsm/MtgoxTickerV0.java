
// line 1 "MtgoxTickerV0.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/fsm/MtgoxTickerV0.java MtgoxTickerV0.ragel
//
package com.appspot.btcticker.fsm;

public class MtgoxTickerV0 {
	
	public static final String URL_V0 = "https://mtgox.com/api/0/data/ticker.php";


// line 14 "src/com/appspot/btcticker/fsm/MtgoxTickerV0.java"
private static byte[] init__ticker_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    3,    1,    4,    1,    5,    2,
	    2,    3
	};
}

private static final byte _ticker_actions[] = init__ticker_actions_0();


private static byte[] init__ticker_key_offsets_0()
{
	return new byte [] {
	    0,    0,    1,    2,    3,    4,    5,    6,    7,    8,    9,   10,
	   11,   12,   16,   23,   31,   32,   34,   38,   39,   43,   50,   58,
	   59,   61,   66,   68,   72,   73,   75,   78
	};
}

private static final byte _ticker_key_offsets[] = init__ticker_key_offsets_0();


private static char[] init__ticker_trans_keys_0()
{
	return new char [] {
	  123,   34,  116,  105,   99,  107,  101,  114,   34,   58,  123,   34,
	   65,   90,   97,  122,   95,   48,   57,   65,   90,   97,  122,   34,
	   95,   48,   57,   65,   90,   97,  122,   58,   48,   57,   44,   46,
	   48,   57,   34,   65,   90,   97,  122,   95,   48,   57,   65,   90,
	   97,  122,   34,   95,   48,   57,   65,   90,   97,  122,   58,   48,
	   57,   44,   46,  125,   48,   57,   48,   57,   44,  125,   48,   57,
	  125,   48,   57,   44,   48,   57,    0
	};
}

private static final char _ticker_trans_keys[] = init__ticker_trans_keys_0();


private static byte[] init__ticker_single_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    0,    1,    2,    1,    0,    2,    1,    0,    1,    2,    1,
	    0,    3,    0,    2,    1,    0,    1,    0
	};
}

private static final byte _ticker_single_lengths[] = init__ticker_single_lengths_0();


private static byte[] init__ticker_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    2,    3,    3,    0,    1,    1,    0,    2,    3,    3,    0,
	    1,    1,    1,    1,    0,    1,    1,    0
	};
}

private static final byte _ticker_range_lengths[] = init__ticker_range_lengths_0();


private static byte[] init__ticker_index_offsets_0()
{
	return new byte [] {
	    0,    0,    2,    4,    6,    8,   10,   12,   14,   16,   18,   20,
	   22,   24,   27,   32,   38,   40,   42,   46,   48,   51,   56,   62,
	   64,   66,   71,   73,   77,   79,   81,   84
	};
}

private static final byte _ticker_index_offsets[] = init__ticker_index_offsets_0();


private static byte[] init__ticker_indicies_0()
{
	return new byte [] {
	    0,    1,    2,    1,    3,    1,    4,    1,    5,    1,    6,    1,
	    7,    1,    8,    1,    9,    1,   10,    1,   11,    1,   12,    1,
	   13,   13,    1,   14,   14,   14,   14,    1,   15,   14,   14,   14,
	   14,    1,   16,    1,   17,    1,   18,   19,   20,    1,   21,    1,
	   22,   22,    1,   23,   23,   23,   23,    1,   24,   23,   23,   23,
	   23,    1,   25,    1,   26,    1,   18,   27,   29,   28,    1,   30,
	    1,   18,   29,   30,    1,   31,    1,   32,    1,   18,   32,    1,
	    1,    0
	};
}

private static final byte _ticker_indicies[] = init__ticker_indicies_0();


private static byte[] init__ticker_trans_targs_0()
{
	return new byte [] {
	    2,    0,    3,    4,    5,    6,    7,    8,    9,   10,   11,   12,
	   13,   14,   15,   16,   17,   18,   19,   29,   18,   20,   21,   22,
	   23,   24,   25,   26,   25,   28,   27,   31,   30
	};
}

private static final byte _ticker_trans_targs[] = init__ticker_trans_targs_0();


private static byte[] init__ticker_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    1,    0,    3,    0,   11,    9,    0,    5,    0,    1,    0,
	    3,    0,   11,    0,    5,    9,    7,    0,    7
	};
}

private static final byte _ticker_trans_actions[] = init__ticker_trans_actions_0();


static final int ticker_start = 1;
static final int ticker_first_final = 31;
static final int ticker_error = 0;

static final int ticker_en_main = 1;


// line 13 "MtgoxTickerV0.ragel"



// line 43 "MtgoxTickerV0.ragel"


    public double weightedValue(String json) {
        char[] data = json.toCharArray();
        
        // Used by Ragel
        int cs;
        int p = 0;
        int pe = data.length;
        
        // Used to store extracted data
        int mark = 0;
        final int zero = (int) '0';
        int i = 0;
        double f = 0.0;
        double scale = 1.0;

        String attribute = null;

        double lastValue = 0.0;
        double buyValue = 0.0;
        double sellValue = 0.0;

        
// line 167 "src/com/appspot/btcticker/fsm/MtgoxTickerV0.java"
	{
	cs = ticker_start;
	}

// line 67 "MtgoxTickerV0.ragel"
        
// line 174 "src/com/appspot/btcticker/fsm/MtgoxTickerV0.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _ticker_key_offsets[cs];
	_trans = _ticker_index_offsets[cs];
	_klen = _ticker_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _ticker_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _ticker_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _ticker_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _ticker_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _ticker_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _ticker_indicies[_trans];
	cs = _ticker_trans_targs[_trans];

	if ( _ticker_trans_actions[_trans] != 0 ) {
		_acts = _ticker_trans_actions[_trans];
		_nacts = (int) _ticker_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _ticker_actions[_acts++] )
			{
	case 0:
// line 18 "MtgoxTickerV0.ragel"
	{ mark = p; }
	break;
	case 1:
// line 19 "MtgoxTickerV0.ragel"
	{
        attribute = json.substring(mark, p);
    }
	break;
	case 2:
// line 23 "MtgoxTickerV0.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 3:
// line 24 "MtgoxTickerV0.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 4:
// line 25 "MtgoxTickerV0.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
	case 5:
// line 27 "MtgoxTickerV0.ragel"
	{
        if      ("buy".equals(attribute))  { buyValue = i + f; }
        else if ("sell".equals(attribute)) { sellValue = i + f; }
        else if ("last".equals(attribute)) { lastValue = i + f; }
    }
	break;
// line 284 "src/com/appspot/btcticker/fsm/MtgoxTickerV0.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
case 5:
	}
	break; }
	}

// line 68 "MtgoxTickerV0.ragel"

        if (cs < ticker_first_final) {
            throw new RuntimeException("??? " + json);
        }

        return (sellValue + buyValue + 2*lastValue) / 4;
    }

}

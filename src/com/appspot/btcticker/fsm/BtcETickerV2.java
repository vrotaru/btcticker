
// line 1 "BtcETickerV2.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/fsm/BtcETickerV2.java BtcETickerV2.ragel
//

package com.appspot.btcticker.fsm;

import com.appspot.btcticker.model.Valuation;

/*
{"ticker":
	{"high":97.98
	,"low":93.95
	,"avg":95.965
	,"vol":440958.41992
	,"vol_cur":4588.39126
	,"last":97.979
	,"buy":97.979
	,"sell":97.954
	,"updated":1376501899
	,"server_time":1376501899
	}
}
*/
public class BtcETickerV2 {

	public static final String URL_V2 = "https://btc-e.com/api/2/btc_usd/ticker";
	

// line 32 "src/com/appspot/btcticker/fsm/BtcETickerV2.java"
private static byte[] init__ticker_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    2,    2,    0,    1,    2,    1,    3,    2,
	    1,    4,    2,    1,    5,    2,    2,    3,    2,    2,    4,    2,
	    2,    5,    3,    0,    1,    3,    3,    0,    1,    4,    3,    0,
	    1,    5
	};
}

private static final byte _ticker_actions[] = init__ticker_actions_0();


private static short[] init__ticker_key_offsets_0()
{
	return new short [] {
	    0,    0,    1,    2,    3,    4,    5,    6,    7,    8,    9,   10,
	   11,   12,   20,   26,   27,   29,   33,   34,   42,   48,   49,   51,
	   56,   58,   62,   63,   70,   77,   83,   84,   86,   91,   93,   97,
	  104,  111,  118,  124,  125,  127,  132,  134,  138,  145,  152,  159,
	  165,  166,  168,  173,  175,  179,  181,  184,  191,  198,  204,  205,
	  207,  211,  213,  216,  223,  230,  237,  243,  244,  246,  250,  252,
	  255,  262,  269,  276,  282,  283,  285,  289,  291,  294
	};
}

private static final short _ticker_key_offsets[] = init__ticker_key_offsets_0();


private static char[] init__ticker_trans_keys_0()
{
	return new char [] {
	  123,   34,  116,  105,   99,  107,  101,  114,   34,   58,  123,   34,
	   95,   98,  108,  115,   65,   90,   97,  122,   34,   95,   65,   90,
	   97,  122,   58,   48,   57,   44,   46,   48,   57,   34,   95,   98,
	  108,  115,   65,   90,   97,  122,   34,   95,   65,   90,   97,  122,
	   58,   48,   57,   44,   46,  125,   48,   57,   48,   57,   44,  125,
	   48,   57,  125,   34,   95,  117,   65,   90,   97,  122,   34,   95,
	  121,   65,   90,   97,  122,   34,   95,   65,   90,   97,  122,   58,
	   48,   57,   44,   46,  125,   48,   57,   48,   57,   44,  125,   48,
	   57,   34,   95,   97,   65,   90,   98,  122,   34,   95,  115,   65,
	   90,   97,  122,   34,   95,  116,   65,   90,   97,  122,   34,   95,
	   65,   90,   97,  122,   58,   48,   57,   44,   46,  125,   48,   57,
	   48,   57,   44,  125,   48,   57,   34,   95,  101,   65,   90,   97,
	  122,   34,   95,  108,   65,   90,   97,  122,   34,   95,  108,   65,
	   90,   97,  122,   34,   95,   65,   90,   97,  122,   58,   48,   57,
	   44,   46,  125,   48,   57,   48,   57,   44,  125,   48,   57,   48,
	   57,   44,   48,   57,   34,   95,  117,   65,   90,   97,  122,   34,
	   95,  121,   65,   90,   97,  122,   34,   95,   65,   90,   97,  122,
	   58,   48,   57,   44,   46,   48,   57,   48,   57,   44,   48,   57,
	   34,   95,   97,   65,   90,   98,  122,   34,   95,  115,   65,   90,
	   97,  122,   34,   95,  116,   65,   90,   97,  122,   34,   95,   65,
	   90,   97,  122,   58,   48,   57,   44,   46,   48,   57,   48,   57,
	   44,   48,   57,   34,   95,  101,   65,   90,   97,  122,   34,   95,
	  108,   65,   90,   97,  122,   34,   95,  108,   65,   90,   97,  122,
	   34,   95,   65,   90,   97,  122,   58,   48,   57,   44,   46,   48,
	   57,   48,   57,   44,   48,   57,    0
	};
}

private static final char _ticker_trans_keys[] = init__ticker_trans_keys_0();


private static byte[] init__ticker_single_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    4,    2,    1,    0,    2,    1,    4,    2,    1,    0,    3,
	    0,    2,    1,    3,    3,    2,    1,    0,    3,    0,    2,    3,
	    3,    3,    2,    1,    0,    3,    0,    2,    3,    3,    3,    2,
	    1,    0,    3,    0,    2,    0,    1,    3,    3,    2,    1,    0,
	    2,    0,    1,    3,    3,    3,    2,    1,    0,    2,    0,    1,
	    3,    3,    3,    2,    1,    0,    2,    0,    1,    0
	};
}

private static final byte _ticker_single_lengths[] = init__ticker_single_lengths_0();


private static byte[] init__ticker_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    2,    2,    0,    1,    1,    0,    2,    2,    0,    1,    1,
	    1,    1,    0,    2,    2,    2,    0,    1,    1,    1,    1,    2,
	    2,    2,    2,    0,    1,    1,    1,    1,    2,    2,    2,    2,
	    0,    1,    1,    1,    1,    1,    1,    2,    2,    2,    0,    1,
	    1,    1,    1,    2,    2,    2,    2,    0,    1,    1,    1,    1,
	    2,    2,    2,    2,    0,    1,    1,    1,    1,    0
	};
}

private static final byte _ticker_range_lengths[] = init__ticker_range_lengths_0();


private static short[] init__ticker_index_offsets_0()
{
	return new short [] {
	    0,    0,    2,    4,    6,    8,   10,   12,   14,   16,   18,   20,
	   22,   24,   31,   36,   38,   40,   44,   46,   53,   58,   60,   62,
	   67,   69,   73,   75,   81,   87,   92,   94,   96,  101,  103,  107,
	  113,  119,  125,  130,  132,  134,  139,  141,  145,  151,  157,  163,
	  168,  170,  172,  177,  179,  183,  185,  188,  194,  200,  205,  207,
	  209,  213,  215,  218,  224,  230,  236,  241,  243,  245,  249,  251,
	  254,  260,  266,  272,  277,  279,  281,  285,  287,  290
	};
}

private static final short _ticker_index_offsets[] = init__ticker_index_offsets_0();


private static byte[] init__ticker_indicies_0()
{
	return new byte [] {
	    0,    1,    2,    1,    3,    1,    4,    1,    5,    1,    6,    1,
	    7,    1,    8,    1,    9,    1,   10,    1,   11,    1,   12,    1,
	   13,   14,   15,   16,   13,   13,    1,   17,   13,   13,   13,    1,
	   18,    1,   19,    1,   20,   21,   22,    1,   23,    1,   24,   25,
	   26,   27,   24,   24,    1,   28,   24,   24,   24,    1,   29,    1,
	   30,    1,   20,   31,   33,   32,    1,   34,    1,   20,   33,   34,
	    1,   35,    1,   28,   24,   36,   24,   24,    1,   28,   24,   37,
	   24,   24,    1,   38,   24,   24,   24,    1,   39,    1,   40,    1,
	   20,   41,   33,   42,    1,   43,    1,   20,   33,   43,    1,   28,
	   24,   44,   24,   24,    1,   28,   24,   45,   24,   24,    1,   28,
	   24,   46,   24,   24,    1,   47,   24,   24,   24,    1,   48,    1,
	   49,    1,   20,   50,   33,   51,    1,   52,    1,   20,   33,   52,
	    1,   28,   24,   53,   24,   24,    1,   28,   24,   54,   24,   24,
	    1,   28,   24,   55,   24,   24,    1,   56,   24,   24,   24,    1,
	   57,    1,   58,    1,   20,   59,   33,   60,    1,   61,    1,   20,
	   33,   61,    1,   62,    1,   20,   62,    1,   17,   13,   63,   13,
	   13,    1,   17,   13,   64,   13,   13,    1,   65,   13,   13,   13,
	    1,   66,    1,   67,    1,   20,   68,   69,    1,   70,    1,   20,
	   70,    1,   17,   13,   71,   13,   13,    1,   17,   13,   72,   13,
	   13,    1,   17,   13,   73,   13,   13,    1,   74,   13,   13,   13,
	    1,   75,    1,   76,    1,   20,   77,   78,    1,   79,    1,   20,
	   79,    1,   17,   13,   80,   13,   13,    1,   17,   13,   81,   13,
	   13,    1,   17,   13,   82,   13,   13,    1,   83,   13,   13,   13,
	    1,   84,    1,   85,    1,   20,   86,   87,    1,   88,    1,   20,
	   88,    1,    1,    0
	};
}

private static final byte _ticker_indicies[] = init__ticker_indicies_0();


private static byte[] init__ticker_trans_targs_0()
{
	return new byte [] {
	    2,    0,    3,    4,    5,    6,    7,    8,    9,   10,   11,   12,
	   13,   14,   55,   63,   72,   15,   16,   17,   18,   53,   17,   19,
	   20,   27,   35,   44,   21,   22,   23,   24,   23,   26,   25,   81,
	   28,   29,   30,   31,   32,   33,   32,   34,   36,   37,   38,   39,
	   40,   41,   42,   41,   43,   45,   46,   47,   48,   49,   50,   51,
	   50,   52,   54,   56,   57,   58,   59,   60,   61,   60,   62,   64,
	   65,   66,   67,   68,   69,   70,   69,   71,   73,   74,   75,   76,
	   77,   78,   79,   78,   80
	};
}

private static final byte _ticker_trans_targs[] = init__ticker_trans_targs_0();


private static byte[] init__ticker_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    5,    0,    0,    1,    0,
	    0,    0,    0,    0,    0,    0,    5,    0,    1,    0,    3,    0,
	    0,    0,    0,    0,   30,    0,   11,   20,    0,    0,    0,    0,
	    0,   26,    0,    8,   17,    0,    0,    0,    0,    0,   34,    0,
	   14,   23,    3,    0,    0,    0,    0,   30,    0,   11,   20,    0,
	    0,    0,    0,    0,   26,    0,    8,   17,    0,    0,    0,    0,
	    0,   34,    0,   14,   23
	};
}

private static final byte _ticker_trans_actions[] = init__ticker_trans_actions_0();


static final int ticker_start = 1;
static final int ticker_first_final = 81;
static final int ticker_error = 0;

static final int ticker_en_main = 1;


// line 67 "BtcETickerV2.ragel"
	

	public static Valuation parse (String json) 
	{
		char[] data = json.toCharArray();
		
		int cs = 0;
		int p = 0;
		int pe = data.length;
		
		int zero = (int) '0';
		long i = 0;
		double f = 0.0;
		double scale = 1.0;
        
        double last = 0;
        double buy = 0;
        double sell = 0;
		
		
// line 240 "src/com/appspot/btcticker/fsm/BtcETickerV2.java"
	{
	cs = ticker_start;
	}

// line 87 "BtcETickerV2.ragel"
		
// line 247 "src/com/appspot/btcticker/fsm/BtcETickerV2.java"
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
// line 40 "BtcETickerV2.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 1:
// line 41 "BtcETickerV2.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 2:
// line 42 "BtcETickerV2.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
	case 3:
// line 55 "BtcETickerV2.ragel"
	{ last = i + f; }
	break;
	case 4:
// line 56 "BtcETickerV2.ragel"
	{ buy  = i + f; }
	break;
	case 5:
// line 57 "BtcETickerV2.ragel"
	{ sell = i + f; }
	break;
// line 351 "src/com/appspot/btcticker/fsm/BtcETickerV2.java"
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

// line 88 "BtcETickerV2.ragel"
		
		if (cs < ticker_first_final) {
            return null;
        }
        else {
        	Valuation v = new Valuation(buy, sell, last);
        	
        	return v;
        }
	}
}